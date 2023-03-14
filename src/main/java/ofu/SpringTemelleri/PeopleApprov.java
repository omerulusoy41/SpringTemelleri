package ofu.SpringTemelleri;



import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PeopleApprov implements Condition{

	// Burdan dönen değere göre people benini ayağa kladırır
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return true;
	}
	
	

}
