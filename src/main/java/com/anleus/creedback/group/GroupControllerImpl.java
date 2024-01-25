package com.anleus.creedback.group;

import org.openapitools.api.GroupApi;
import org.openapitools.model.AccountTs;
import org.openapitools.model.GroupTs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class GroupControllerImpl implements GroupApi {

    @Autowired
    private GroupService groupService;

    @Override
    public ResponseEntity<GroupTs> changeAdmin(String groupId, String userId) {
        return null;
    }

    @Override
    public ResponseEntity<GroupTs> createGroup(GroupTs groupTs) {
        return null;
    }

    @Override
    public ResponseEntity<List<AccountTs>> getGroupAccount(String id) {
        return null;
    }

    @Override
    public ResponseEntity<GroupTs> getGroupByName(String groupName) {
        return null;
    }
}
