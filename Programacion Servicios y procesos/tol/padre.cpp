#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

const char *progname = "./hijo";

sig_atomic_t d = 0;

pid_t
spawn ()
{
  pid_t son = 0;

  if ((son = fork ()))
    return son;

  execlp (progname, progname, (char *) NULL);
  fprintf (stderr, "Something went wrong with: %s\n", progname);
  exit (EXIT_FAILURE);

  return (pid_t) 0;
}

int
main (int argc, char *argv[])
{
  pid_t son = 0;
  son = spawn ();

  while (!d)
    usleep (100000);

  wait (&exit_status);

  if (WIFEXITED (exit_status))
    printf ("\nMESSAGE:\n%s\n", buffer.data);
  else
    fprintf (stderr, "Abnormal termination of: %s.\n", progname);

  return EXIT_SUCCESS;
}