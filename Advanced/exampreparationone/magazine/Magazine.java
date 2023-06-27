package exampreparationone.magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Magazine {

    private List<Cloth> data;
    private String type;
    private int capacity;

    public Magazine(String type, int capacity) {
        this.data = new ArrayList<>();
        this.type = type;
        this.capacity = capacity;
    }

    public void addCloth(Cloth cloth) {
        if (data.size() < capacity) {
            data.add(cloth);
        }
    }

    public boolean removeCloth(String color) {
        Cloth cloth = getCloth(color);
        data.remove(cloth);
        return cloth != null;
    }

    public Cloth getSmallestCloth() {
        if (data.size() != 0) {
            return data.stream().sorted((e1, e2) -> e1.getSize() - e2.getSize()).limit(1).collect(Collectors.toList()).get(0);
        } else {
            return null;
        }
    }

    public Cloth getCloth(String color) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getColor().equals(color)) {
                return data.get(i);
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("%s exampreparationone.magazine contains:\n",type));
        for (int i = 0; i < data.size(); i++) {
            stringBuilder.append(data.get(i)+"\n");
        }
        return stringBuilder.toString().trim();
    }
}
