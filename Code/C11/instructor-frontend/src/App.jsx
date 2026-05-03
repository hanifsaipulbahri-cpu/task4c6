import "./App.css";

function App() {
  const instructors = [
    {
      id: "1",
      name: "Alice Joshson",
      specialization: "Java",
      status: "ACTIVE",
      yearsOfExperience: 5
    },
    {
      id: "2",
      name: "Kumar K.",
      specialization: "MongoDB",
      status: "ACTIVE",
      yearsOfExperience: 8
    },
    {
      id: "3",
      name: "Michael Chew",
      specialization: "React",
      status: "INACTIVE",
      yearsOfExperience: 4
    }
  ];

  return (
    <div className="page">
      <h1>Instructor Frontend</h1>
      <p>This is our first React screen.</p>

      <div className="instructor-list">
        {instructors.map((instructor) => (
          <div className="card" key={instructor.id}>
            <h2>{instructor.name}</h2>
            <p>Specialization: {instructor.specialization}</p>
            <p>Status: {instructor.status}</p>
            <p>Years of Experience: {instructor.yearsOfExperience}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;