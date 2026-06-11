public class TaskThread implements Runnable {
    private Task task;

    public TaskThread(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        int totalSeconds = task.getDuration() / 1000;
        int steps = Math.max(1, totalSeconds);

        for (int elapsed = 1; elapsed <= steps; elapsed++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            double percentage = ((double) elapsed / steps) * 100.0;
            String status = (elapsed == steps) ? "completed" : "processing";

            System.out.printf("%ds ::: %s - %.2f%% - %s :::%n",
                    elapsed, task.getName(), percentage, status);
        }
    }
}
