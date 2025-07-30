/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
    }

    void save(Resume r) {
        for (Resume res : storage) {
            if (res == null) {
                res = r;
                break;
            }
        }
    }

    Resume get(String uuid) {
        Resume g = new Resume();
        for (int i = 0; i < storage.length - 1; i++) {
            if (storage[i].toString() == uuid) {
                g = storage[i];
            } else {
                g = null;
            }
        }
        return g;
    }

    void delete(String uuid) {

    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return new Resume[0];
    }

    int size() {
        return storage.length;
    }
}
