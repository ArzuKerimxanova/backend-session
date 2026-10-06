package az.training.taskmanagement.service.impl;

import az.training.taskmanagement.model.Task;
import az.training.taskmanagement.service.NotificationService;


public class NoOpNotificationService implements NotificationService {


    @Override
    public void notifyTaskCreated(Task task) {
        
    }

    @Override
    public void notifyTaskUpdated(Task task) {

    }

    @Override
    public void notifyTaskDeleted(Task task) {

    }
}