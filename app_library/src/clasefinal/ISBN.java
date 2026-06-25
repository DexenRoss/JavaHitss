package clasefinal;

public final class ISBN {
    private final String value;

    public ISBN(String value){
        validations(value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private void validations(String value){
        if (value.length() != 13 || value == null || value.isBlank()) {
            throw new IllegalArgumentException("ISBN most contain 13 characteres");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if (!(obj instanceof ISBN other)) {
            return false;
        }
        return value.equals(other.value);

        /*ISBN other = (ISBN) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;*/
    }

    @Override
    public int hashCode() {
        /*final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;*/
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }

    
}
