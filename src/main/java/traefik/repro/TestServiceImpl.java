package traefik.repro;

import io.grpc.stub.StreamObserver;

public class TestServiceImpl extends TestServiceGrpc.TestServiceImplBase {
	@Override
	public void testMethod(final Test request, final StreamObserver<Test> responseObserver) {
			responseObserver.onNext(request);
			responseObserver.onCompleted();
	}
}
