import sun.security.util.ArrayUtil;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < storage.length - 1; i++) {
            storage[i] = null;
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length - 1; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                break;
            }
        }
    }

    Resume get(String uuid) {
        Resume g = new Resume();
        for (int i = 0; i < storage.length - 1; i++) {
            try {
                if (storage[i].uuid.equals(uuid)) {
                    g = storage[i];
                    break;
                } else {
                    g.uuid = "Is not available!";
                }
            } catch (NullPointerException e) {

            }
        }
        return g;
    }

    void delete(String uuid) {
        for (int i = 0; i < storage.length - 1; i++) {
            try {
                if (i != storage.length - 1) {
                    if (storage[i].uuid.equals(uuid)) {
                        for (int j = i; j < storage.length-1; j++) {
                            storage[j] = storage[j + 1];
                        }
                    }
                } else {
                    storage[i] = null;
                }
            } catch (NullPointerException e) {

            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] r = new Resume[0];
        try {
            int count = 0;
            for (int i = 0; i < storage.length - 1; i++) {
                if (storage[i] != null) {
                    count++;
                }
            }
            r = new Resume[count];
            for (int i = 0; i < storage.length - 1; i++) {
                if (storage[i] != null) {
                    r[i] = storage[i];
                } else {
                    break;
                }
            }
        } catch (Exception e) {

        }

        return r;
    }

    int size() {
        int count = 0;
        for (int i = 0; i < storage.length - 1; i++) {
            if (storage[i] != null) {
                count++;
            }

        }
        return count;
    }
}
