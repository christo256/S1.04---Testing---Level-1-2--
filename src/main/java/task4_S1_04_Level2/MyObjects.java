package task4_S1_04_Level2;

public class MyObjects {
    private String name;

    public MyObjects(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("name can`t be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyObjects)) return false;

        MyObjects myObjects = (MyObjects) obj;
        return this.name.equals(myObjects.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();

    }

    @Override
    public String toString() {
        return "MyObjects{" +
                "name='" + name + '\'' +
                '}';
    }
}

