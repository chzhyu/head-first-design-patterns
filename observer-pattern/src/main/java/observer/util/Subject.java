package observer.util;


/**
 * @author chzhyu at 18-4-4 上午9:22
 */
public interface Subject {
    /**
     * register the observer to subject
     * @param observer to be register
     */
    void registerObserver(Observer observer);

    /**
     * remove the observer from subject list
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * when the state of subject changed, subject should
     * notify the all observer
     */
    void notifyObservers();
}
