package com.dalhousie.Neighbourly.community.entities;

import com.dalhousie.Neighbourly.helprequest.model.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommunityResponse {
    private int userId;
    private int neighbourhoodId;
    private RequestStatus status;
}
