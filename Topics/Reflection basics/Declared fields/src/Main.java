
import java.lang.reflect.Field;


/**
 * Get number of accessible public fields for a given class.
 */
class FieldGetter {

    public int getNumberOfFieldsClassDeclares(Class<?> clazz) {
        int count = 0;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            if (f != null) {
                count++;
            }


        }
        return count;

    }
}