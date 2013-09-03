package br.jus.tre_pa.frameworkdemoiselle.query.filter.operations;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.SingularOperation;

public class IsTrueOperation implements SingularOperation<Boolean> {

	@Override
	public <T> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, Boolean value) {
		return cb.isTrue(p.<Boolean>get(field));
	}

}
