package Iterator;

public class TCLTelevision implements Television{
    private Object[] obj={"cctv-1","cctv-2","cctv-3","cctv-4","cctv-5"};
    @Override
    public TViterator createIterator() {
    return new TCLhIterator();
    }
    private class TCLhIterator implements TViterator{
        private int currentIndex=0;

        @Override
        public void setChannel(int i) {
            currentIndex=i;
        }

        @Override
        public void next() {
            if (currentIndex<obj.length)
                currentIndex++;
        }

        @Override
        public void previous() {
            if (currentIndex>0)
                currentIndex--;
        }

        @Override
        public boolean isLast() {
            return currentIndex==obj.length;
        }

        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }
    }
}
