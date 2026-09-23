package Week4_5;

import java.util.Objects;

class Animal34 {
    String name;
    Animal34(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal34 other = (Animal34) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}