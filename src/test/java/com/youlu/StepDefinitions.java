package com.youlu;

import com.youlu.model.num;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {

    num nums = new num();
    @Given("当第一个参数是 {int}")
    public void step1(int a){
        nums.setNum1(a);
    }
    @Given("第二个参数是 {int}")
    public void step2(int b){
        nums.setNum2(b);
    }
    @When("调用这个接口")
    public  int  step3(){
        return nums.getNum1()+nums.getNum2();
    }

    @Then("断言结果 {int}")
    public void step4(int c){
        assert c==step3();
    }
}
