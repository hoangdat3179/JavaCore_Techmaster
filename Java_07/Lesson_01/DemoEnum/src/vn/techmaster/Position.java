package vn.techmaster;

public enum Position {
    //enum sử dụng để định nghĩa các vị trí của cầu thủ trong bóng đá
    GK ("Thủ môn"), DF ("Hậu vệ"), FW ("Tiền đạo"), MF ("Tiền về");

    String value;

    Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
