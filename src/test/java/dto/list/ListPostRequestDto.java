package dto.list;

import enums.Pos;

public class ListPostRequestDto {
    String name;
    String idBoard;
    String idListSource;
    String pos;

    public String getName() {
        return name;
    }

    public ListPostRequestDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public ListPostRequestDto setIdBoard(String idBoard) {
        this.idBoard = idBoard;
        return this;
    }

    public String getIdListSource() {
        return idListSource;
    }

    public ListPostRequestDto setIdListSource(String idListSource) {
        this.idListSource = idListSource;
        return this;
    }

    public String getPos() {
        return pos;
    }

    public ListPostRequestDto setPos(Pos pos) {
        this.pos = pos.toString();
        return this;
    }
}
