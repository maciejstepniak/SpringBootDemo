package pl.stepniak.maciej.demo;

import org.springframework.stereotype.Repository;

@Repository("DemoRepositoryZ")
class DemoRepositoryImplZ implements DemoRepository {
    @Override
    public void methodA() {
        System.out.println("AZ");
    }

    @Override
    public int methodB(final int b) {
        return 1;
    }

    @Override
    public String methodC() {
        return "CZ";
    }
}
