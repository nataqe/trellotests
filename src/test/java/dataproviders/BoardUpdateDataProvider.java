package dataproviders;

import dto.BoardPutRequestDto;
import enums.PrefsPermissionLevel;

import static enums.PrefsBackground.RED;
import static enums.PrefsCardAging.PIRATE;
import static enums.PrefsComments.ORG;
import static enums.PrefsInvitations.ADMINS;
import static enums.PrefsVoting.MEMBERS;

public class BoardUpdateDataProvider {
    public BoardPutRequestDto getBoardUpdateTemplate() {
        return new BoardPutRequestDto()
                .setName("UpdatedName")
                .setDesc("UpdatedDesc")
                .setClosed(true)
                .setPrefsBackground(RED)
                .setPrefsComments(ORG)
                .setPrefsCalendarFeedEnabled(true)
                .setPrefsCardAging(PIRATE)
                .setPrefsCardCovers(false)
                .setPrefsHideVotes(true)
                .setPrefsInvitations(ADMINS)
                .setPrefsPermissionLevel(PrefsPermissionLevel.ORG)
                .setPrefsSelfJoin(false)
                .setPrefsVoting(MEMBERS)
                .setLabelNamesBlue("LabelNamesBlue")
                .setLabelNamesGreen("LabelNamesGreen")
                .setLabelNamesOrange("LabelNamesOrange")
                .setLabelNamesPurple("LabelNamesPurple")
                .setLabelNamesRed("LabelNamesRed")
                .setLabelNamesYellow("LabelNamesYellow");
    }
}
