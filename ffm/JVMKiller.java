import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

public class JVMKiller {
    public static void main(String[] args) {
        Linker linker = Linker.nativeLinker();

        try (Arena offHeap = Arena.ofConfined()) {
            SymbolLookup lib = SymbolLookup.libraryLookup("libsegv.so", offHeap);
            MethodHandle segv = linker.downcallHandle(lib.find("segv").orElseThrow(), FunctionDescriptor.ofVoid());
            
            segv.invokeExact();
        } catch(Throwable t) {
            t.printStackTrace();
        }
    }
}
