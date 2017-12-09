package lk.techtalks.spring.data.reactive.repo;

import lk.techtalks.spring.data.reactive.domain.Taxi;
import io.reactivex.Flowable;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;

/**
 * Created by shazi on 11/21/2017.
 */
public interface RxJava2TaxiRepository extends RxJava2CrudRepository<Taxi, String> {

    Flowable<Taxi> findByNumber(String number);

    @Tailable
    Flowable<Taxi> findWithTailableCursorBy();

}
