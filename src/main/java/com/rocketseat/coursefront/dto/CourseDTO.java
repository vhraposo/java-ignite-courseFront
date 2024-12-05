package com.rocketseat.coursefront.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record CourseDTO (UUID id, String name, String teacher, String category, String active, LocalDateTime createdAt) {
    public boolean isIncomplete() {
        return name == null || name.isBlank()
                || teacher == null || teacher.isBlank()
                || category == null || category.isBlank();
    }
}
