package pl.stepniak.maciej.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
class DemoService {

    private final DemoRepository demoRepositoryX;
    private final DemoRepository demoRepositoryY;
    private final DemoRepository demoRepositoryZ;

    public DemoService(@Qualifier("DemoRepositoryX") final DemoRepository demoRepositoryX,
                       @Qualifier("DemoRepositoryY") final DemoRepository demoRepositoryY,
                       @Qualifier("DemoRepositoryZ") final DemoRepository demoRepositoryZ) {
        this.demoRepositoryX = demoRepositoryX;
        this.demoRepositoryY = demoRepositoryY;
        this.demoRepositoryZ = demoRepositoryZ;
    }

    void method1(final ImplementationType repositoryType) {
        final DemoRepository demoRepository = getRepository(repositoryType);
        demoRepository.methodA();
    }

    int method2(final ImplementationType repositoryType) {
        final DemoRepository demoRepository = getRepository(repositoryType);
        return demoRepository.methodB(0);
    }

    String method3(final ImplementationType repositoryType) {
        final DemoRepository demoRepository = getRepository(repositoryType);
        return demoRepository.methodC();
    }

    private DemoRepository getRepository(final ImplementationType repositoryType) {
        switch (repositoryType) {
            case X:
                return demoRepositoryX;
            case Y:
                return demoRepositoryY;
            default:
                return demoRepositoryZ;
        }
    }
}
