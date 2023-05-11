package DefiningClasses.Exercises.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Parent> parents;
    private List<Children> children;
    private List<Pokemon> pokemons;
    private CarOwned car;

    class CarOwned {
        private String model;
        private int speed;

        public CarOwned(String model, int speed) {
            this.model = model;
            this.speed = speed;
        }

        public String getModel() {
            return model;
        }

        public int getSpeed() {
            return speed;
        }
    }

    class Company {
        private String companyName;
        private String department;
        private double salary;

        public Company(String companyName, String department, double salary) {
            this.companyName = companyName;
            this.department = department;
            this.salary = salary;
        }

        public String getCompanyName() {
            return companyName;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }

    class Parent {
        private String parentName;
        private String parentBirthday;

        public Parent(String parentName,String parentBirthday) {
            this.parentName = parentName;
            this.parentBirthday = parentBirthday;
        }

        public String getParentName() {
            return parentName;
        }

        public String getParentBirthday() {
            return parentBirthday;
        }
    }

    class Children {
        private String childName;
        private String childBirthday;

        public Children(String childName,String childBirthday) {
            this.childName = childName;
            this.childBirthday = childBirthday;
        }

        public String getChildName() {
            return childName;
        }

        public String getChildBirthday() {
            return childBirthday;
        }
    }

    class Pokemon {
        private String pokemonName;
        private String pokemonType;

        public Pokemon(String pokemonName,String pokemonType) {
            this.pokemonName = pokemonName;
            this.pokemonType = pokemonType;
        }

        public String getPokemonName() {
            return pokemonName;
        }

        public String getPokemonType() {
            return pokemonType;
        }
    }

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public void setCar (String model, int speed) {
        CarOwned carOwned = new CarOwned(model,speed);
        car = carOwned;
    }

    public void setCompany (String name, String department, double salary) {
        Company job = new Company(name,department,salary);
        company = job;
    }

    public void addChild(String name, String birthDate) {
        this.children.add(new Children(name, birthDate));
    }

    public void addParent(String name, String birthDate) {
        this.parents.add(new Parent(name, birthDate));
    }

    public void addPokemon(String name, String type) {
        this.pokemons.add(new Pokemon(name, type));
    }

    public Company getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public List<Children> getChildren() {
        return children;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public CarOwned getCar() {
        return car;
    }
}
