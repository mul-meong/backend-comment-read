package com.mulmeong.comment.read.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "feed_comment")
public class FeedComment {
    @Id
    private String id;
    private String feedUuid;
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