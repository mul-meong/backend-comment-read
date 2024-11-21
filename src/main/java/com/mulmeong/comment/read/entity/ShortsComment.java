package com.mulmeong.comment.read.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "shorts_comment")
public class ShortsComment {
    @Id
    private String id;
    private String shortsUuid;
    private String memberUuid;
    private String commentUuid;
    private String content;
    private boolean status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer likeCount;
    private Integer dislikeCount;
    private Integer recommentCount;
    private String customCursor;
}