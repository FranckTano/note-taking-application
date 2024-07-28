package ci.pigier.ui;

import java.net.URL;

public enum FXMLPage {
    LIST("/ci/pigier/ui/fxml/ListNotes.fxml"),
    ADD("/ci/pigier/ui/fxml/AddEdit.fxml"),
    EDIT("/ci/pigier/ui/fxml/EditNoteUI.fxml"),
    DELETE("/ci/pigier/ui/fxml/DeleteNote.fxml"),
    CLEAR("/ci/pigier/ui/fxml/ClearNote.fxml");

    private final String location;

    FXMLPage(String location) {
        this.location = location;
    }

    public URL getPage() {
        return getClass().getResource(location);
    }
}
