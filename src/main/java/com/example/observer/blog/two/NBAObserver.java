package com.example.observer.blog.two;

public class NBAObserver implements Observer {
	public class CartoonObserver implements Observer {

		@Override
		public void update(Object data) {
			System.out.println( " 我是"+this.getClass().getSimpleName()+"，  "+data+"别看漫画了");
		}
	}

    @Override
    public void update(Object data) {
        System.out.println(" 我是" + this.getClass().getSimpleName() + "，  " + data + "别看NBA了");
    }

}

