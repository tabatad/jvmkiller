CC = gcc
CFLAGS = -shared -fPIC
TARGET = libsegv.so
SRCS = segv.c
OBJS = segv.o

$(TARGET): $(OBJS)
	$(CC) $(CFLAGS) -o $@ $^

$(OBJS): $(SRCS)
	$(CC) -c $(SRCS)

all: clean $(TARGET)

clean:
	-rm -f $(OBJS) $(TARGET)