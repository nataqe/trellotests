package dataproviders;

import dto.board.BoardPostRequestDto;
import enums.PrefsComments;
import enums.PrefsInvitations;
import enums.PrefsPermissionLevel;
import enums.PrefsVoting;

import static enums.KeepFromSource.NONE;
import static enums.PowerUps.ALL;
import static enums.PrefsBackground.BLUE;
import static enums.PrefsCardAging.REGULAR;

public class BoardInputDataProvider {
    public BoardPostRequestDto getBoardInputTemplate() {
        return new BoardPostRequestDto()
                .setDesc("Default Description")
                .setName("AprilBoard")
                .setDefaultLabels(true)
                .setDefaultLists(true)
                //  .setIdBoardSource("")
                .setKeepFromSource(NONE)
                .setPowerUps(ALL)
                .setPrefsPermissionLevel(PrefsPermissionLevel.PRIVATE)
                .setPrefsVoting(PrefsVoting.DISABLED)
                .setPrefsComments(PrefsComments.MEMBERS)
                .setPrefsInvitations(PrefsInvitations.MEMBERS)
                .setPrefsSelfJoin(true)
                .setPrefsCardCovers(true)
                .setPrefsBackground(BLUE)
                .setPrefsCardAging(REGULAR);
    }
}
