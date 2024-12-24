package interfaces;

public interface ICanSurprise {

    void becomeSurprised(SurpisingType type);
    //метод созданный для того чтобы наши люди удивлялись (создаем его пока абстрактным чтобы потом переопределить)

    enum SurpisingType {

        SMALL("чуть чуть"),
        MIDDLE(""),
        STRONG("очень сильно");

        private String title;

        SurpisingType(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
