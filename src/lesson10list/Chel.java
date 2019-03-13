package lesson10list;

import java.util.Objects;

public class Chel {


        private int age;
        private String name;

        public Chel (int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Chel{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Chel)) return false;
            Chel person10 = (Chel) o;
            return getAge() == person10.getAge() &&
                    Objects.equals(getName(), person10.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getAge(), getName());
        }
    }

