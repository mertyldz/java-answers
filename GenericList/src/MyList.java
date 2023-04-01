public class MyList<T> {
    T[] arr;
    int capacity = 10;

    public MyList() {
        this.arr = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    public int size() {
        int counter = 0;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] != null) {
                counter++;
            }

        }
        return counter;
    }

    public void add(T data) {
        if (getLastFullIndex() + 1 == this.arr.length) {
            increaseCapacity();
        }

        int lastFullIndex = getLastFullIndex();
        int firstEmptyIndex = lastFullIndex + 1;
        arr[firstEmptyIndex] = data;

    }

    public void increaseCapacity() {
        this.capacity = getCapacity() * 2;

        T[] tmpArray = (T[]) new Object[this.capacity];
        for (int i = 0; i < this.arr.length; i++) {
            tmpArray[i] = this.arr[i];
        }

        this.arr = tmpArray;
    }

    public int getLastFullIndex() {
        int lastFullIndex = -1;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] != null) {
                lastFullIndex = i;
            }
        }
        return lastFullIndex;
    }

    @Override
    public String toString() {
        String elements = "[";
        for (int i = 0; i < size(); i++) {
            if (arr[i] != null) {
                elements += arr[i];
            }

            if (i != size() - 1) {
                elements += ",";
            }

        }
        elements = elements.strip();
        return elements += "]";
    }

    public T get(int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                return arr[i];
            }
        }
        return null;
    }

    public T[] remove(int index) {
        if (index >= size()) {
            return null;
        } else {
            for (int i = index; i < size() - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size() - 1] = null;
        }
        return arr;
    }

    public T[] set(int index, T data) {
        if (index >= size()) {
            return null;
        }

        arr[index] = data;
        return arr;
    }

    public int indexOf(T data) {
        int indexData = -1;
        for (int i = 0; i < size(); i++) {
            if (arr[i] == data) {
                indexData = i;
                break;
            }
        }
        return indexData;
    }

    public int lastIndexOf(T data) {
        int indexData = -1;
        for (int i = size() - 1; i >= 0; i--) {
            if (arr[i] == data) {
                indexData = i;
                break;
            }
        }
        return indexData;
    }

    public boolean isEmpty() {
        for (T a : arr) {
            if (a != null) {
                return false;
            }
        }
        return true;
    }

    public T[] toArray() {
        T[] newArray = (T[]) new Object[this.getCapacity()];
        for (int i = 0; i < this.size(); i++) {
            newArray[i] = this.get(i);
        }
        return newArray;
    }

    public void clear() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = null;
        }
    }

    public MyList<T> sublist(int start, int finish) {
        MyList<T> subMyList = new MyList<>();
        int subIndex = 0;
        for (int i = start; i < finish; i++) {
            subMyList.arr[subIndex] = this.arr[i];
            subIndex++;
        }
        return subMyList;
    }

    public boolean contains(T data) {
        for (T a : arr) {
            if (a == data) {
                return true;
            }
        }
        return false;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
