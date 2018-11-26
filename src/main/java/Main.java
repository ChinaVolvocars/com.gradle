import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;

public class Main {
    public static void main(String[] args) {

        BehaviorSubject behaviorSubject = BehaviorSubject.createDefault(10);

        PublishSubject<Object> objectPublishSubject = PublishSubject.create();

        objectPublishSubject.subscribe(new Observer<Object>() {

            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(Object o) {
                System.out.println(o);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
        objectPublishSubject.onNext(1);
        objectPublishSubject.onComplete();
        objectPublishSubject.onNext(2);
        objectPublishSubject.onNext(3);



    }


}
