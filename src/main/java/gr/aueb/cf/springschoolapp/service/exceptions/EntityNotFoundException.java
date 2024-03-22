package gr.aueb.cf.springschoolapp.service.exceptions;

public class EntityNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    public EntityNotFoundException(Class<?> entityClass, Long id){
        super("Entity " + entityClass.getSimpleName() + " does not exist");
    }
}
