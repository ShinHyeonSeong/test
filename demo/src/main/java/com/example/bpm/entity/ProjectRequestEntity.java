package com.example.bpm.entity;

import com.example.bpm.dto.ProjectRequestDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "project_requst")
@IdClass(ProjectRequestPKEntity.class)
public class ProjectRequestEntity {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "send_uuid")
    private UserEntity sendUUID;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recv_uuid")
    private UserEntity recvUUID;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private ProjectEntity projectIdToRequest;


    public static ProjectRequestEntity toProjectRequestEntity(ProjectRequestDto projectRequestDto) {
        ProjectRequestEntity projectRequestEntity = new ProjectRequestEntity();
        projectRequestEntity.setSendUUID(projectRequestDto.getSendUUID());
        projectRequestEntity.setRecvUUID(projectRequestDto.getRecvUUID());
        return projectRequestEntity;
    }
}
