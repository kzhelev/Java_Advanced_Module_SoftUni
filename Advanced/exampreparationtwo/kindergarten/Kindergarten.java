package exampreparationtwo.kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kindergarten {

    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child) {
        if (registry.size() < capacity) {
            return registry.add(child);
        } else {
            return false;
        }
    }

    public boolean removeChild(String firstName) {
        if (getChild(firstName) != null) {
            return registry.remove(getChild(firstName));
        } else {
            return false;
        }
    }

    public int getChildrenCount() {
        return registry.size();
    }

    public Child getChild(String firstName) {
        return registry.stream().filter(e -> e.getFirstName().equals(firstName)).findFirst().orElse(null);
    }

    public String registryReport() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("Registered children in %s:\n--\n",this.name));

        List<Child> sortedRegistry = registry.stream()
                .sorted(Comparator.comparing(Child::getAge)
                        .thenComparing(Child::getFirstName)
                        .thenComparing(Child::getLastName))
                .collect(Collectors.toList());

        for (int i = 0; i < sortedRegistry.size(); i++) {
            if (i != sortedRegistry.size()-1) {
                stringBuilder.append(sortedRegistry.get(i)).append("\n").append("--\n");
            } else {
                stringBuilder.append(sortedRegistry.get(i));
            }
        }

        return stringBuilder.toString().trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Child> getRegistry() {
        return registry;
    }

    public void setRegistry(List<Child> registry) {
        this.registry = registry;
    }
}
