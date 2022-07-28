package ru.almazrostov.searchdoc.util;

import org.springframework.stereotype.Component;
import ru.almazrostov.searchdoc.entity.Doc;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Component
public class GenerateUUIDForDocUtil {

    public static UUID generateUUID(Doc doc) {
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getOwnerDoc());
        sb.append(".");
        sb.append(doc.getDecimalNumber());
        sb.append(".");
        sb.append(doc.getPart());

        return UUID.nameUUIDFromBytes(sb.toString().getBytes(StandardCharsets.UTF_8));
    }
}
