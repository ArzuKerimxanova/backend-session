package az.training.taskmanagement.dto;

import az.training.taskmanagement.model.Priority;
import az.training.taskmanagement.model.TaskStatus;

/**
 * Task-ı qismən yeniləmək üçün (PATCH). Bütün sahələr nullable-dır:
 * yalnız dəyəri verilən sahələr yenilənir.
 */
public record UpdateTaskRequest(String title, String description, TaskStatus status, Priority priority, Long categoryId) {
}
