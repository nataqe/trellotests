package dataproviders;

import dto.list.ListPostRequestDto;

import static enums.Pos.TOP;

public class ListInputDataProvider {
    public ListPostRequestDto getListInputTemplate() {
        return new ListPostRequestDto()
                .setName("NewName")
                .setPos(TOP);
    }
}
