package read_file;

// enum String {
//     RED,
//     GREEN,
//     BLUE,
//     BLACK
// }

public class Item {
    private String id;
    private String typeOfTrial;
    private String colorWord;
    private String inkColor;
    private String respColor;
    private String resultResp;
    private Float reactionTime;

    public Item(
            String id,
            String typeOfTrial,
            String colorWord,
            String inkColor,
            String respColor,
            String resultResp,
            Float reactionTime) {
        this.id = id;
        this.typeOfTrial = typeOfTrial;
        this.colorWord = colorWord;
        this.inkColor = inkColor;
        this.respColor = respColor;
        this.resultResp = resultResp;
        this.reactionTime = reactionTime;
    }

    public String getTypeOfTrial() {
        return typeOfTrial;
    }

    public void setTypeOfTrial(String typeOfTrial) {
        this.typeOfTrial = typeOfTrial;
    }

    public String getColorWord() {
        return colorWord;
    }

    public void setColorWord(String colorWord) {
        this.colorWord = colorWord;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public String getRespColor() {
        return respColor;
    }

    public void setRespColor(String respColor) {
        this.respColor = respColor;
    }

    public String isResultResp() {
        return resultResp;
    }

    public void setResultResp(String resultResp) {
        this.resultResp = resultResp;
    }

    public Float getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(Float reactionTime) {
        this.reactionTime = reactionTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getResultResp() {
        return resultResp;
    }

}
