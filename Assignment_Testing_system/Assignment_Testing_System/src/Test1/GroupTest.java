package Test1;

import java.util.Objects;

public class GroupTest {
    private int id;
    private String name;
    public GroupTest() {}

    public GroupTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupTest groupTest = (GroupTest) o;
        return Objects.equals(name, groupTest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
