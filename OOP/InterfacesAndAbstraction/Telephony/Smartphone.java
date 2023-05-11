package InterfacesAndAbstraction.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).matches("^[0-9]+$")) {
                if (i != numbers.size() - 1) {
                    stringBuilder.append(String.format("Calling... " + numbers.get(i) + "%n"));
                } else {
                    stringBuilder.append(String.format("Calling... " + numbers.get(i)));
                }
            } else {
                if (i != numbers.size() - 1) {
                    stringBuilder.append("Invalid number!\n");
                } else {
                    stringBuilder.append("Invalid number!");
                }
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < urls.size(); i++) {
            if (urls.get(i).matches("^\\D+$+")) {
                if (i != urls.size() - 1) {
                    stringBuilder.append(String.format("Browsing: " + urls.get(i)+"!\n"));
                } else {
                    stringBuilder.append(String.format("Browsing: " + urls.get(i)+"!"));
                }
            } else {
                if (i != urls.size() - 1) {
                    stringBuilder.append("Invalid URL!\n");
                } else {
                    stringBuilder.append("Invalid URL!");
                }
            }
        }
        return stringBuilder.toString();
    }
}
