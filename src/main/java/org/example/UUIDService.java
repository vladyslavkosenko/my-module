package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UUIDService {
    public List<UUID> getUUID(int size) {
        List<UUID> uuids = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            uuids.add(UUID.randomUUID());
        }
        return uuids;
    }
}