package carracingafterfeedback.domains;

public class Name {
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    public Name(String name) {
        _validate(name);
        this.name = name;
    }


    private void _validate(String name) {
        if (name.length()<=0) {
            throw new RuntimeException("자동차 이름은 1자 이상이어야 합니다.");
        }

        if (name.length()>=MAX_NAME_LENGTH) {
            throw new RuntimeException("자동차 이름은 "+MAX_NAME_LENGTH+"자를 초과할 수 없습니다.");
        }
    }

    public String getName() {
        return this.name;
    }
}
