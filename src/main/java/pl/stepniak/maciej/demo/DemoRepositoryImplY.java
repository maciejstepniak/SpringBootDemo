package pl.stepniak.maciej.demo;

import org.springframework.stereotype.Repository;

@Repository("DemoRepositoryY")
class DemoRepositoryImplY implements DemoRepository {
    @Override
    public void methodA() {
        System.out.println("AY");
    }

    @Override
    public int methodB(final int b) {
        return 0;
    }

    @Override
    public String methodC() {
        return "CY";
    }
}
