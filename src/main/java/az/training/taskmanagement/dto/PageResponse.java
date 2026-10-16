package az.training.taskmanagement.dto;

import java.util.List;


public record PageResponse<T>(List<T> content, int page, int size, long totalElements, int totalPages) {

    public static <T> PageResponse<T> of(List<T> all, int page, int size) {
        int total = all.size();
        int from = (int) Math.min((long) page * size, total);
        int to = Math.min(from + size, total);
        int totalPages = (int) Math.ceil((double) total / size);
        return new PageResponse<>(List.copyOf(all.subList(from, to)), page, size, total, totalPages);
    }
}