package dto.list;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Accessors(fluent = true, chain = true)
@Getter
@Setter
public class ListResponseDto {
    String id;
    String name;
    boolean closed;
    String idBoard;
    Integer pos;
    Object limits;
}