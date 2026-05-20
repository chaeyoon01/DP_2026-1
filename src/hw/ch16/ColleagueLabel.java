package hw.ch16;

import java.awt.Color;
import java.awt.Label;

public class ColleagueLabel extends Label implements Colleague{
    private Mediator mediator;

    public ColleagueLabel(String Label){
        super(Label);
    }

    // Mediator를 설정한다 
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다
    @Override
    public void setColleagueEnabled(boolean enabled) {
        // 활성/비활성에 맞게 배경색을 변경한다
        setText(enabled ? "●로그인 가능" : "●로그인 불가");
        setForeground(enabled ? Color.blue : Color.gray);
    
    }
}
