package pl.stepniak.maciej.demo;

import org.springframework.stereotype.Repository;

@Repository("DemoRepositoryX")
class DemoRepositoryImplX implements DemoRepository {
    @Override
    public void methodA() {
        System.out.println("AX");
    }

    @Override
    public int methodB(final int b) {
        return -1;
    }

    @Override
    public String methodC() {
        return "CX";
    }
}
